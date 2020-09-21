package datadriven;

import databases.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {



        public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        public static DataReader excelReader = new DataReader();

        public DataSource() {
        }

        public static void insertDataIntoDB() {
            List<String> list = getTitleValue();
            connectToSqlDB = new ConnectToSqlDB();
            connectToSqlDB.insertDataFromArrayListToSqlTable(list, "foxNewsTitles", "Titles");
        }

        public static List<String> getTitleValue() {
            List<String> titlesList = new ArrayList();
            titlesList.add("Trump");
            titlesList.add("Algeria");
            titlesList.add("Corona");
            titlesList.add("Vote");
            titlesList.add("NASA");
            titlesList.add("Unemployment");
            titlesList.add("Russia");
            titlesList.add("Korea");
            return titlesList;
        }

        public static List<String> getTitlesListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
            new ArrayList();
            List<String> list = connectToSqlDB.readDataBase("foxNewsTitles", "Titles");
            return list;
        }

        public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException {
            String path = "../FoxNews/DataTest/FoxNewsData.xlsx";
            String[] myStringArray = excelReader.fileReader2(path, 0);

            for(int i = 1; i < myStringArray.length; ++i) {
                System.out.println(myStringArray[i] + " ");
            }

            ArrayList<String> list = new ArrayList();

            for(int i = 0; i < myStringArray.length; ++i) {
                list.add(myStringArray[i]);
            }

            return list;
        }
    }


