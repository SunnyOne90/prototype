/**
 * Created by Sunny on 2019/4/15.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjgaofeng
 * @create 2019-04-15 下午5:29
 **/
public class Test {

    public static void main(String[] args) {
        Jerry jerry = new Jerry();
        jerry.setAge("18");
        jerry.setSex("男");
        List list = new ArrayList<String>();
        list.add("哈哈");
        jerry.setHobby(list);

        Client client = new Client();
        Jerry jerry1 = (Jerry)client.startClone(jerry);

//        System.out.println(jerry == jerry1);
        System.out.println(jerry1.getHobby() == jerry.getHobby());
    }
}
