package com.excel.homeapplienceservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "communications")
public class Communications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "communication_id")
    private Long communicationId;
    
//    @ManyToOne
//    @JoinColumn(name = "sender_id")
//    private Users sender;
//
//    @ManyToOne
//    @JoinColumn(name = "receiver_id")
//    private Users receiver;

}
