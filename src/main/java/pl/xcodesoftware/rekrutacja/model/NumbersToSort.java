package pl.xcodesoftware.rekrutacja.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NumbersToSort {

    @JsonProperty("numbers")
    public List<Integer> numbers = new ArrayList<Integer>();

    @JsonProperty("order")
    public String order;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public NumbersToSort() {
    }
}
