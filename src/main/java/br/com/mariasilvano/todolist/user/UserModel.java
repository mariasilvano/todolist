package br.com.mariasilvano.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
//@Getter apenas getter @Setter apenas setter
//Getter e Settter podendo ser definido por atributo. basta colocar em cima do atributo desejado
//@Column para nomer diferente a coluna no banco
@Data
@Entity(name="usuarios")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
