package com.prasertcbs;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        demo();
//        demoWithHeaderColumn();
        demoWithHeaderColumnDelimiter();
    }

    public static void demo() {
        File f = new File("test.csv");
        try {
            CSVParser parser = CSVParser.parse(f, Charset.defaultCharset(), CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : parser) {
//                System.out.println(csvRecord);
                System.out.printf("country = %s, gold = %s\n",
                                  csvRecord.get(0), csvRecord.get(1));
            }
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoWithHeaderColumn() {
        File f = new File("testWithHeader.csv");
        try {
            CSVParser parser = CSVParser.parse(f, Charset.defaultCharset(), CSVFormat.DEFAULT.withHeader());
            for (CSVRecord csvRecord : parser) {
//                System.out.println(csvRecord);
                System.out.printf("country = %s, gold = %s, silver = %s, bronze, = %s\n",
                                  csvRecord.get(0), csvRecord.get("gold"),
                                  csvRecord.get("silver"), csvRecord.get("bronze")
                                 );
            }
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoWithHeaderColumnDelimiter() {
        File f = new File("testDelimiter.csv");
        try {
            CSVParser parser = CSVParser.parse(f, Charset.defaultCharset(),
                                               CSVFormat.DEFAULT.withHeader().withDelimiter('|'));
            for (CSVRecord csvRecord : parser) {
//                System.out.println(csvRecord);
                int gold, silver, bronze;
                gold = Integer.parseInt(csvRecord.get("gold"));
                silver = Integer.parseInt(csvRecord.get("silver"));
                bronze = Integer.parseInt(csvRecord.get("bronze"));

                System.out.printf("country = %s, gold = %s, silver = %s, bronze = %s, total = %d\n",
                                  csvRecord.get(0), csvRecord.get("gold"),
                                  csvRecord.get("silver"), csvRecord.get("bronze"),
                                  gold + silver + bronze
                                 );
            }
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
