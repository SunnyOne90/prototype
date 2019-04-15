/**
 * Created by Sunny on 2019/4/15.
 */

import java.io.*;
import java.util.List;

/**
 * @author bjgaofeng
 * @create 2019-04-15 下午5:24
 **/
public class Jerry implements EmployeeInfo,Serializable{

    private String age;
    private String sex;
    private List hobby;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public EmployeeInfo clone() {
//        Jerry jerry = new Jerry();
//        jerry.setHobby(this.hobby);
//        jerry.setAge(this.age);
        return deepClone();
    }
    public Jerry deepClone(){
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Jerry jerry = (Jerry)objectInputStream.readObject();
            return jerry;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
