package com.jls.project.transapp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Step 2: Creating a List of Transactions
 * Step 3: Filtering and summing Transactions with stream
 * Step 4: sorting transaction by date using Lambda
 * Step 5: Using Optional to Handle potential Null values
 * step 6: working with the new API
 */
public class TransactionProcessor {
    public static void main(String[] args) {
        //step 1
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1",1000.0, LocalDate.of(2023, 3, 10)),
                new Transaction("T2",5000.0, LocalDate.of(2023, 1, 28)),
                new Transaction("T3",1500.0, LocalDate.of(2023, 2, 15))
        );

        //step 3
        double totalAmount = transactions.stream() // creates a stream from the list transactions
                .filter(t -> t.getAmount() > 1000) // intermediate operation that filters the amount that are gt than 1000
                .mapToDouble(Transaction::getAmount)  // this is an intermediate operation that maps the value to double
                .sum(); // this is a terminal operation that sums up the value

        System.out.println("Total of Transactions over 1000: "+ totalAmount);

        //step 4
        transactions.stream() // stream of transaction is created
                .sorted((t1,t2) -> t1.getData().compareTo(t2.getData())) // intermediate operator that sorts the transactiosn based on date
                .forEach(System.out::println); // terminal operation

        //step 5
        String id = "T2";
        Optional<Transaction> transaction = findTransactionsById(id);
        transaction.ifPresent(System.out::println);

        //step 6
        LocalDate now = LocalDate.now();
        transaction.stream()
                .filter(t -> t.getData().isAfter(now.minusMonths(9)))
                .forEach(System.out::println);
    }

    public static Optional<Transaction> findTransactionsById(String id) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1",1000.0, LocalDate.of(2023, 3, 10)),
                new Transaction("T2",5000.0, LocalDate.of(2023, 1, 28)),
                new Transaction("T3",1500.0, LocalDate.of(2023, 2, 15))
        );

        return transactions.stream() // stream creation
                .filter(t -> t.getId().equals(id)) // this is intermediate operation to filter and find the transaction (id)
                .findFirst(); // return the value if found
    }
}
