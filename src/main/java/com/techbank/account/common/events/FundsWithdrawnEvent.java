package com.techbank.account.common.events;

import com.techbank.cqrs.core.events.BaseEvents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FundsWithdrawnEvent extends BaseEvents {

    private Double amount;
}
