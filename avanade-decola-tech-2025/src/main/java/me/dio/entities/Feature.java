package me.dio;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_feature")
public class Feature extends BaseItem {

}
