package com.base.learn.service;

import com.base.learn.domain.Architect;
import com.base.learn.domain.Designer;
import com.base.learn.domain.Employee;
import com.base.learn.domain.Programmer;

/**
 * @Author myf15609
 * @Date 2025/2/8
 */
public class TeamService {
    private static int counter = 1; // 静态变量，用来给开发团队新增成员自动生成团队中的唯一ID，即 memberId
    private final int MAX_MEMBER = 5; // 表示开发团队最大成员数

    private Programmer[] team = new Programmer[MAX_MEMBER]; // 用来保存当前团队中的各个成员对象
    private int total = 0; // 记录团队成员的实际人数

    /**
     * 返回当前团队的所有对象
     *
     * @return 包含所有成员对象的数组，数组大小与成员人数一致
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 添加成员到团队
     *
     * @param e 待添加的成员对象
     * @throws TeamException 找不到指定员工，异常情况
     */
    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER)
            throw new TeamException("成员已满，无法添加");
        if (!(e instanceof Programmer))
            throw new TeamException("该成员不是开发人员，无法添加");

        // 根据 status 判断是否已经是某团队成员
        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch (status) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假，无法添加");
        }

        // 其实这种场景无需判断，因为添加团队员工后，会修改员工状态，如果员工状态是busy，上面就抛出异常了
        boolean isExist = ifExist(p);
        if (isExist)
            throw new TeamException("该员工已在本团队中");

        // 团队中至多只能有一名架构师
        // 团队中至多只能有两名设计师
        // 团队中至多只能有三名程序员

        // 计算程序员、设计师、架构师数量
        int proNum = 0;
        int desNum = 0;
        int arcNum = 0;

        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else {
                proNum++;
            }
        }
        if (p instanceof Architect) {
            if (arcNum >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (desNum >= 2) {
                throw new TeamException("团队中至多只能有二名设计师");
            }
        } else {
            if (proNum >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        // 如果代码执行到此位置，意味着 p 是可以添加到 team 数组中的
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
        team[total++] = p;
    }

    /**
     * 判断指定员工是否已经存在于当前团队中
     *
     * @param p 待判断的员工对象
     * @return true 表示该员工已存在，false 表示该员工不存在
     */
    private boolean ifExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId())
                return true;
        }
        return false;
    }

    /**
     * 从团队中删除指定 memberId 的成员
     *
     * @param memberId 指定 memberId
     * @throws TeamException 找不到指定 memberId 的员工，删除失败
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total)
            throw new TeamException("找不到指定 memberId 的员工，删除失败");

        // 调整数组
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }
}
