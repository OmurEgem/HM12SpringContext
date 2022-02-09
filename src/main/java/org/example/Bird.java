package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Bird implements Animal {

    private String name;
    private String breed;

    @Override
    public void animalPlus() {
        System.out.println("Very beautiful "+breed +" by name:  "+name);
    }

    @Override
    public void animalMinus() {
        System.out.println("very noisy animal "+breed);
    }
}
