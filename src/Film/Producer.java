package Film;

public class Producer {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    String producerName;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Producer(String producerName){
        this.producerName = producerName;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public String getProducerName(){
        return producerName;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return "Producer: " + producerName + '\n';
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
