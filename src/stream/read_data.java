package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class read_data {


    public List<country> read_country_from_csv(String filename){
        List<country>country_data=new ArrayList<>();
        try {
            FileReader file = new FileReader(filename);
            BufferedReader buff=new BufferedReader(file);
            String line="";
            while (line!=null) {
                line = buff.readLine();
                if(line!=null) {
                    String[] features = line.replaceAll(" ","").split(",");
                    country_data.add(new country(features[0], features[1], features[2], Double.parseDouble(features[3]), Double.parseDouble(features[4]), Double.parseDouble(features[5]), Integer.parseInt(features[6])));
                }
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return country_data;
    }


    public List<city> read_city_from_csv(String filename){
        List<city>city_data=new ArrayList<>();
        try {
            FileReader file = new FileReader(filename);
            BufferedReader buff=new BufferedReader(file);
            String line="";
            while (line!=null) {
                line = buff.readLine();
                if(line!=null) {
                    String[] features = line.replaceAll(" ","").split(",");
                    city_data.add(new city(Integer.parseInt(features[0]),features[1],Integer.parseInt(features[2]),features[3]));

                }
            }


        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return city_data;
    }



}



