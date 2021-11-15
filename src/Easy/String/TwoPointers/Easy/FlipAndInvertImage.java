package Easy.String.TwoPointers.Easy;

/***
 * Given an n x n binary matrix image, flip the image horizontally, then invert it,
 * and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.
 *
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 *
 * For example, inverting [0,1,1] results in [1,0,0].
 *
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlipAndInvertImage {

    public static void main(String[] args) {
//        System.out.println(flipAndInvertImage());
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int index = 0; index < image.length; index++) {
            int left  = 0, right = image.length - 1;

            while (left < right) {
                int temp = image[index][left];
                image[index][left++] = image[index][right];
                image[index][right--] = temp;
            }
            for (left = 0; left < image.length; left++) {
                image[index][left] = image[index][left] == 1 ? 0 : 1;
            }
        }
        return image;
    }
}
