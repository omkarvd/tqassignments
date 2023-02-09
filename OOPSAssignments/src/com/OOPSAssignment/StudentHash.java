//8. print 2 objects in sysout and see its hashcode is different
//Eg Student@15db9742 and Student@2329742

package com.OOPSAssignment;

public class StudentHash {
	int id;
	String name;

	public static void main(String[] args) {
		StudentHash sh1 = new StudentHash();
		StudentHash sh2 = new StudentHash();
		System.out.println(sh1);
		System.out.println(sh2);
//		//9. If you do this Student s1 = new Student(); Student s2 = s1;
//		Now print sop(s1) sop(s2) see both reference variables are
//		pointing to same location.
//		But if you use new keyword for s1 and s2 see both values
//		would be different
		StudentHash s1 = new StudentHash();
		StudentHash s2 = s1;

		System.out.println(s1);
		System.out.println(s2);

	}
}
