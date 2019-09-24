public class FindDuplication {
    public static void main(String[] args) {
        FindDuplication f = new FindDuplication();
        f.Test();
    }

    //测试代码
    public void Test() {
        int[] arr = new int[]{3, 4, 2, 1, 2};
        System.out.println(getDuplicate(arr));
    }

    //找到数组中一个重复的数字
    //返回-1代表无重复数字或者输入无效
    public int getDuplicate(int[] arr) {

        //判断数组大小合法性
        if (arr == null || arr.length <= 0) {
            System.out.println("数组无效!");
            return  -1;
        }

        //判断数组中元素合法性
        for (int x : arr) {
            if (x < 0 || x > arr.length - 1) {
                System.out.println("数字超出范围!");
                return -1;
            }
        }
        //3 4 2 1 2
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            while (arr[i] != i) {
                if (arr[arr[i]] == arr[i]) {
                    return arr[i];
                }
                //交换arr[arr[i]] 和 arr[i]
                temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        System.out.println("数组中无重复数字!");
        return  -1;
    }

}
