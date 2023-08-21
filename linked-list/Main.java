// import package.LinkedList;

// LinkedList
 class Main{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println("helloo");
    
        ll.insert("Ahmad");
        ll.insert("ali");
        ll.insert("java");
        System.out.println(ll.toString()); 
        System.out.println(ll.includes("ali"));
        ll.insertAfter("Ahmad", "anshasi");
        ll.insertAfter("anshasi", "Ahmad");
        ll.insertBefore("ali", "alsai");
        ll.append("lastword");

  }}
