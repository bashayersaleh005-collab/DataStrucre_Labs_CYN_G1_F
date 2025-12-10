package Arrays;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner = new Scanner(System.in);

    // طباعة المصفوفة
    public void Traversal(int []a) {
        for(int i = 0; i < a.length; i++)
            System.out.println("Index [" + i + "] = " + a[i]);
    }

    // طباعة عكسية
    public void Revers_Traversal(int []a) {
        for(int i = a.length - 1; i >= 0; i--)
            System.out.println("Index [" + i + "] = " + a[i]);
    }

    // إدخال عناصر من المستخدم
    public void input(int []a) {
        for(int i = 0; i < a.length; i++)
            a[i] = scanner.nextInt();
    }

    // تعديل قيمة
    public void update(int []a, int index, int nvalue) {
        if(index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] = nvalue;
    }

    // حذف (تصفير العنصر)
    public void delete(int []a, int index) {
        if(index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] = 0;
    }

    // حذف بإزاحة العناصر لليسار
    public void Shift_Left_Delete(int []a, int index) {
        if(index < 0 || index >= a.length) {
            System.out.println("Index not found");
            return;
        }

        for(int i = index; i < a.length - 1; i++)
            a[i] = a[i + 1];

        a[a.length - 1] = Integer.MIN_VALUE;
    }

    // البحث الخطي
    public int LinearSearch(int []a, int svalue) {
        for(int i = 0; i < a.length; i++) {
            if(svalue == a[i])
                return i;
        }
        return -1;
    }

    // البحث الثنائي
    public int binarySearch(int[] a, int svalue, int findex, int lindex) {
        while(findex <= lindex) {
            int mid = (findex + lindex) / 2;

            if(svalue == a[mid])
                return mid;

            if(svalue > a[mid])
                findex = mid + 1;
            else
                lindex = mid - 1;
        }
        return -1;
    }
}