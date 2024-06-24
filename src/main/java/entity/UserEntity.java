package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.UUID;

public class UserEntity extends PanacheEntity
{
@Entity
@Table(nome="tb_users")
public class UserEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;
    public String username;

}
}
