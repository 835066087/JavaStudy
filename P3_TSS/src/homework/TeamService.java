package homework;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.Status;
import com.atguigu.team.service.TeamException;

public class TeamService {

	private final int MAX_MEMBER = 6;
	private static int counter = 1;

	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int realCount = 0;

	public void addMember(Employee e) throws TeamException {

		if (realCount == 6) {
			throw new TeamException("达到团队人员上限");
		}

		if (!(e instanceof Programmer)) {
			throw new TeamException("该成员并非开发团队人员");
		}

		Programmer programmer = (Programmer) e;

		if (programmer.getStatus() == Status.VOCATION) {
			throw new TeamException("该成员正在度假");
		}
		if (programmer.getMemberId() == 0) {
			throw new TeamException("该成员已经是团队成员");
		}

		int architectCount = 0;
		int designerCount = 0;
		int programmerCount = 0;
		for (int i = 0; i < realCount; i++) {
			if (e instanceof Architect) {
				architectCount++;
			} else if (team[i] instanceof Designer) {
				designerCount++;
			} else {
				programmerCount++;
			}
		}

		if (programmer instanceof Architect) {
			if (architectCount == 1) {
				throw new TeamException("该团队已经有一个架构师了");
			}
		}

		this.team[realCount++] = programmer;
	}
}
