package CaseStudy.Model.model.Facility;

public class Room extends Falicity {
   private String accompaniedServiceFree;//Dịch vụ miễn phí đi kèm

   public Room() {

   }

   public Room(String serviceName, String usableArea, String price, int peopleMaximum, String rentalType, String accompaniedServiceFree) {
      super(serviceName, usableArea, price, peopleMaximum, rentalType);
      this.accompaniedServiceFree = accompaniedServiceFree;
   }

   public String getAccompaniedServiceFree() {
      return accompaniedServiceFree;
   }

   public void setAccompaniedServiceFree(String accompaniedServiceFree) {
      this.accompaniedServiceFree = accompaniedServiceFree;
   }

   @Override
   public String toString() {
      return "Room{" +
              "accompaniedServiceFree='" + accompaniedServiceFree + '\'' +
              "} " + super.toString();
   }
}
