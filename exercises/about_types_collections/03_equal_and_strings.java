package about_types_collections;

class e3{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        if (sb.toString().equals(s.toString())){
            System.out.println("Match 1");
        }else if (sb.equals(s)){
            System.out.println("Match 2");
        }else{
            System.out.println("No match");
        }
    }
}

//What is the result? 
//OPR: 
//A: Match 1 <-this 
//B: Match 2 
//C: No Match 
//d: NullPointer Exception 
