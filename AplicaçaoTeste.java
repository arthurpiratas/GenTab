
public class AplicaçaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id  = 10000000;
		char[] Id = new char[8];
		for(int i=0; i<8; i++) {
			Id[i] = Integer.toString(id).charAt(i);
		}
		System.out.println(id);
		System.out.println(Id[7]);
		Id[0] = '2';
		System.out.println(Id[0]);
		id = Integer.parseInt(String.copyValueOf(Id));
		System.out.println(id);
		id++;
		System.out.println(id);
				
	}

}
