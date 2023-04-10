package by.mysite.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity //говорим, что мы работаем с hibernate
@Table(name = "libraries")

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//за его создание отвечает БД
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String address;
}
