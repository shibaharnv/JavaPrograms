package JavaQuiz;

 class privateaccesserror {

    public static void main(String[] args) {

        access obj = new access();
        obj.call(2,3);
        System.out.println(obj.x + " "+obj.x);

    }



}

