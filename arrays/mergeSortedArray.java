package com.arrays;

public class mergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0,temp=0; 

        while (i<m && j<n) {
            if(nums1[i]<=nums2[j]){
                i++;
            }
            else{
                temp=nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i++;
                j++;
            }
        }

        while(i<m){
            i++;
        }
        //System.out.println(" id "+j+" "+nums1[j]);
        j=0;
        while(j<n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        
    }
        
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1 [] = {4,0,0,0,0,0};
		int nums2 [] ={1,2,3,5,6};

		merge(nums1,1,nums2,5);
		
		for(int n: nums1) {
			System.out.print(n+" ");
		}
		System.out.println();
		for(int n: nums2) {
			System.out.print(n+" ");
		}


	}

}
