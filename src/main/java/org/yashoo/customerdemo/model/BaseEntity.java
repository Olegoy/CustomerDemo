package org.yashoo.customerdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

/**
 * Basic class class with property ID
 */
//@Date вместо геттеров сеттеров и тд можно
@MappedSuperclass//тк нет реальной сущности и этот класс используется как базовый
@Getter//чтобы не создавать геттеры и сеттеры в классе будем использовать ломбок (желат уст плагин ломбок в идею)
@Setter
@ToString
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
