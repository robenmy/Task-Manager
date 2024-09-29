package com.StructureHandling.Task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Ticket {

    @Id
    String ticket;
    String program_code;
    String sub_program_ode;
    String rfid;
    String item_type;
    String label_type;
    String Printing;//OFF, PFL, THL, DIG, UVP, THR,UVD, UVS, MHP; // PRINTING METHODS
    String SpecialSettings;//NONE, CBS, XML, SWAP, GSWAP, MWOV, COMBO, DSIDE, SHIFT, SEQIT, SSE;
    String comment;



}
