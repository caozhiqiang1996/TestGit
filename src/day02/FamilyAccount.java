public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        String details = "";
        int balance = 10000;
        while (isFlag){
            System.out.println("---------------��ͥ��֧�������---------------\n");
            System.out.println("                1.��֧��ϸ");
            System.out.println("                2.�Ǽ�����");
            System.out.println("                3.�Ǽ�֧��");
            System.out.println("                4.��   ��\n");
            System.out.print("            ��ѡ��1-4): ");
            //��ȡ�û���ѡ��
            char selection =Utility.readMenuSelection();
            switch (selection){
                case '1':
                    //System.out.println("1.��֧��ϸ");
                    System.out.println("---------------��ǰ��֧��ϸ��¼---------------");
                    System.out.println("��֧\t�˻����\t��֧���\t˵   ��\n");
                    System.out.println(details);
                    System.out.println("--------------------------------------------");
                    break;
                case '2':
                    //System.out.println("�Ǽ�����");
                    System.out.print("���������");
                    int money = Utility.readNumber();
                    System.out.print("��������˵����");
                    String info = Utility.readString();
                    balance += money;
                    details +="����\t"+balance+"\t"+money+"\t\t"+info+"\n";
                    System.out.println("---------------�Ǽ����---------------");
                    break;
                case '3':
                    //System.out.println("�Ǽ�֧��");
                    System.out.print("����֧����");
                    int money1 = Utility.readNumber();
                    System.out.print("����֧��˵����");
                    String info1 = Utility.readString();
                    if (balance >=money1){
                        balance -= money1;
                        details +="֧��\t"+balance+"\t"+money1+"\t"+"\t"+info1+"\n";
                        System.out.println("---------------�Ǽ����---------------");
                    }else {
                        System.out.println("֧�������˻���ȣ�֧��ʧ��");
                    }

                    break;
                case '4':
                    //System.out.println("4.��   ��");
                    System.out.print("ȷ���Ƿ��˳�(Y/N)");
                    char isExit =Utility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
            }
        }
    }
}
