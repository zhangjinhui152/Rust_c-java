package cn.code.polymorphic;



public class Multi01 {
//     �������� ָ���������

	// �������� ���� = new �������ƣ���
	public static void main(String[] args) {
		Fa obj = new Son();
		obj.funs();
		System.out.println(obj.num);
		obj.Show();//��������˭����˭
		//����ȫ������ת�� Ҳ���Ƕ�̬ һ���ǰ�ȫ�� ͬʱ���ܵ������������
		
		//����������ת��
		//�������� obj = ���������ƣ��������
		((Son) obj).fuunsSp();
		Son obj1 = (Son)obj;
		obj1.fuunsSp();
		
		if (obj instanceof Son2) {
			Son2 obj2 = (Son2)obj;
		}
		
		
		
	}
}
