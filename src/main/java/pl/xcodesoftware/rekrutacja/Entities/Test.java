package pl.xcodesoftware.rekrutacja.Entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Test {

//    @JsonProperty("name")
//    public String name;

    @JsonProperty("phones")
    public int[] phones;
    public Test() {
    }
}
