public class Practice4 {
    public void testRfs(String str,StringBuilder stringBuilder){
        str=str+stringBuilder.toString();
        stringBuilder.append(str);
        str=null;
        stringBuilder=null;
    }
    public static void main(String[] args) {
        String a="aaa";
        StringBuilder sb=new StringBuilder("bbb ");
        new Practice4().testRfs(a, sb);
        System.out.println("s= "+a+" sb= "+sb);
    }
}
