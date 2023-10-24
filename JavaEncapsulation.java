public class JavaEncapsulation {
    public static void main(String[] args) {
    Account1 acc=new Account1();
    acc.setAcc_no(8029843023L);
    acc.setName("Debobrata Paul");
    acc.setAmount(150000);
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getAmount());
    }
}

