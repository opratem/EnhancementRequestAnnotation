public class ImplementingER {
    public static void main(String[] args){

        //to retrieve the annotation EnhancementRequest from ImprovePerformance class
       EnhancementRequest annotation = ImprovePerfomance.class.getAnnotation(EnhancementRequest.class);
       

       //to check if annotation is present
       if (annotation != null){
        
        System.out.println("Enhancement Request Details: ");
        System.out.println("ID:" + annotation.id());
        System.out.println("Synopsis: " +annotation.synopsis());
        System.out.println("Engineer: " +annotation.engineer());
        System.out.println("Date: " + annotation.date());

       }
        

    }
    
}
