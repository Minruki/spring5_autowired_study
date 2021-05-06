package spring5_autowired_study.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {
	
	private MemberDao memberDao;
	
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if (member == null) {
			throw new MemberNotFoundException("데이터 없음\n");
		}
		printer.print(member);
		System.out.println();
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}