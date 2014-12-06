//Wael Haidar
//hw11:MatrixSorter 12/4/14 7:47 pm
//CSE2 Section 112 CRN 48811

import java.util.*; //allow the use of the scanner utility from the library 
public class MatrixSorter {
    public static int[][][] buildMat3d() { //start of the method
        int[][][] mat3d = new int[3][7][9]; //initiate the 3D array and its size
        Random rand = new Random();
        for (int i = 0; i < 3; i++) { //fills the first slab of the 3D array with 
            //random number between 1 and 99 inclusive 
            for (int j = 0; j < i + 1; j++) {
                mat3d[0][i][j] = rand.nextInt((99 - 1) + 1) + 1; //generate the random numbers
                //and assign the values to that array 
               /* if (mat3d[0][i][j] == 0) { //this will change the zeros to a 1 since 0 is not accepted 
                    mat3d[0][i][j] = 1;
                }*/
            }
        }
        for (int i = 0; i < 5; i++) { //fills the second slab of the 3D array
            for (int j = 0; j <= i + 1; j++) {
                mat3d[1][i][j] = rand.nextInt((99 - 1) + 1) + 1; //generate the random numbers
                //and assign the values to that array 
                /*if (mat3d[1][i][j] == 0) { //this will change the zeros to a 1 since 0 is not accepted 
                    mat3d[1][i][j] = 1;
                }*/
            }
        }
        for (int i = 0; i < 7; i++) { //fills the third slab of the array 
            for (int j = 0; j <= i + 2; j++) {
                mat3d[2][i][j] = rand.nextInt((99 - 1) + 1) + 1;
                /*if (mat3d[2][i][j] == 0) {
                    mat3d[2][i][j] = 1;
                }*/
            }
        }
        return mat3d; //returns the array
    }
    public static void show(int mat3d[][][]) { //start of the method
        System.out.println("---------------------------Slab 1"); //prints the first slab of the array
        for (int i = 0; i < mat3d.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(mat3d[0][i][j] !=0){
                    System.out.printf("%2d ", mat3d[0][i][j]);}
            }
            System.out.println();
        }
        System.out.println("---------------------------Slab 2"); //prints the second slab of the array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if(mat3d[1][i][j] !=0){
                    System.out.printf("%2d ", mat3d[1][i][j]);}
            }
            System.out.println();
        }
        System.out.println("---------------------------Slab 3"); //prints the third slab of the array
        for (int i = 0; i < mat3d[2].length; i++) {
            for (int j = 0; j < mat3d[2][i].length; j++) {
                if(mat3d[2][i][j] !=0){
                    System.out.printf("%2d ", mat3d[2][i][j]);}
            }
            System.out.println();
        }
    }
    public static int[][] sort(int[][] mat3d) { //the method sorts the two dimentional array in ascending order
        for (int i = 0; i < mat3d.length; i++) {
            sort(mat3d[i]); //calls the method that sorts the array
        }
        return mat3d; //returns the sorted array
    }
    public static int[] sort(int[] mat3d) { //the method sorts the individual arrays in the two dimentional array
        int i, j, temp; //initiate int variables 
        for (i = 1; i < mat3d.length; i++) {
            temp = mat3d[i];
            j = i;
            while (j > 0 && mat3d[j - 1] > temp) {
                mat3d[j] = mat3d[j - 1];
                j--;
            }
            mat3d[j] = temp;
        }
        return mat3d; //returns the sorted array
    }
    public static int findMin(int[][][] mat3d) { //checks for the min entry in the 3D array
        int min = mat3d[0][0][0]; //initiate and assign an int variable 
        for (int i = 0; i < mat3d.length; i++) {
            for (int j = 0; j < mat3d[i].length; j++) {
                for (int k = 0; k < mat3d[i][j].length; k++) {
                    if (mat3d[i][j][k] < min && mat3d[i][j][k] != 0) { //checks if there is a smaller entry
                        min = mat3d[i][j][k];
                    }
                }
            }
        }
        return min; //returns the min value 
    }

    public static void main(String arg[]) {
        int mat3d[][][]; //initiate the 3D array
        mat3d = buildMat3d(); //build and fill the 3D array by calling a method 
        show(mat3d); //prints out the array using a method
        System.out.println(" "); //leave a blank line 
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d)); //calls the method to get the min value 
        System.out.println(" "); //leave a blank line 
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]); //sorts the second slab of the 3D array
        show(mat3d); //prints out the sorted array using the show method
    }
}