package day8;

import day4.Avenger;

public class main {

	public static void main(String[] args) {
		//question-3
		doctor d=new doctor();
		d.getdetails();
		d.dept();
		d.displaydetails();
		engineer e=new engineer();
		e.getdetails();
		e.dept();
		e.displaydetails();
		pilots p=new pilots();
		p.getdetails();
		p.dept();
		p.displaydetails();
		
		//question-4
		doctor doc[]=new doctor[3];
		
		for(int i=0;i<3;i++) {
			doc[i]=new doctor();
			doc[i].getdetails();
			doc[i].displaydetails();
			doc[i].dept();
		}
		engineer eng[]=new engineer[3];
		
		for(int i=0;i<3;i++) {
			eng[i]=new engineer();
			eng[i].getdetails();
			eng[i].displaydetails();
			eng[i].dept();
		}
		pilots pil[]=new pilots[3];
		
		for(int i=0;i<5;i++) {
			pil[i]=new pilots();
			pil[i].getdetails();
			pil[i].displaydetails();
			pil[i].dept();
		}
		
	}

}
