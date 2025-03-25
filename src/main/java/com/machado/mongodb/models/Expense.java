package com.machado.mongodb.models;

import com.machado.mongodb.enums.ExpenseCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("expense")
public class Expense {
    /***
     * as a unique identifier
     */
    @Id
    private String id;

    /***
     * different name in actual db
     */
    @Field("name")
    /***
     * unique values only allowed
     */
    @Indexed(unique = true)
    private String expenseName;

    @Field("category")
    private ExpenseCategory expenseCategory;

    @Field("amount")
    private BigDecimal expenseAmount;
}