package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

public class TeamService {

	// 静态变量，用于添加成员时，为成员对象赋予memberId
	private static int counter = 1;
	public final int MAX_MEMBER = 6;

	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int realCount = 0;

	// 增加成员的方法
	public void addMember(Employee e) throws TeamException {

		if (realCount == 6) {
			throw new TeamException("超过团队上限");
		}
		if (!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员");
		}
		
		Programmer programmer = (Programmer) e;

		if (programmer.getMemberId() != 0) {
			throw new TeamException("该成员已经是团队成员");
		}
		if (programmer.getStatus() == Status.VOCATION) {
			throw new TeamException("该成员正在休假，无法添加");
		}
		// 只能有一名架构师
		
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		for (int i = 0; i < realCount; i++) {
			if (e instanceof Architect) {
				counter1++;
			} else if (team[i] instanceof Designer) {
				counter2++;
			} else {
				counter3++;
			}
		}
		
		
		if (programmer instanceof Architect) {
			if (counter1 == 1) {
				throw new TeamException("团队中只能有一名架构师");
			}
		} else if (programmer instanceof Designer) {
			if (counter2 == 2) {
				throw new TeamException("团队中只能有两名设计师");
			}
		} else {
			if (counter3 == 3) {
				throw new TeamException("团队中只能有三名程序员");
			}
		}

		// team[realCount] = (Programmer) e;
		programmer.setMemberId(counter++);
		programmer.setStatus(Status.BUSY);
		this.team[realCount++] = programmer;

		/*
		 * } else if (e instanceof Designer) { Designer designer = (Designer) e;
		 * team[realCount].setMemberId(counter); realCount++; counter++; } else if (e
		 * instanceof Architect) { Architect architect = (Architect) e;
		 * team[realCount].setMemberId(counter); realCount++; counter++; }
		 */

	}
	// }

	// 获取所有成员的方法
	public Programmer[] getTeam() {
		Programmer[] tmp = new Programmer[realCount];
		for (int i = 0; i < realCount; i++) {
			tmp[i] = this.team[i];
		}

		return tmp;
	}

	public void removeMember(int MemberId) throws TeamException {
		int index = -1;
		for (int i = 0; i < realCount; i++) {
			if (team[i].getMemberId() == MemberId) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			throw new TeamException("TID[" + MemberId + "]不存在的");
		}
		team[index].setMemberId(0);
		team[index].setStatus(Status.FREE);
		team[index] = null;
		for (int i = MemberId; i < realCount - 1; i++) {
			team[i] = team[i + 1];
			team[--realCount] = null;
		}
	}

}
