public class SolutionMergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Implementando o merge de arrays
        int aux = m+n-1; //mantem o indice do proximo item a ser inserido
        int bigger;
        int i = n-1;
        int j = m-1;
        //enquanto ha numeros para se ordenar nos dois vetores, ordenar
        while(i >= 0 && j >= 0){
            if(nums1[j] > nums2[i]){
                bigger = nums1[j];
                j = j-1;
            } else {
                bigger = nums2[i];
                i = i-1;
            }
            nums1[aux] = bigger;
            aux = aux-1;
        }

        //Depois que um deles termina, avaliamos duas alternativas
        //1. Se nums2 foi completamente ordenado, então todos os números de nums1 estão ordenados, não precisamos fazer mais nada
        //2. Se nums1 foi completamente ordenado, então precisamos ordenar nums2 até que nums2 esteja completamente ordenado, ou seja até i < 0.
        while(i >= 0){
            nums1[aux] = nums2[i];
            aux = aux-1;
            i = i-1;
        }
    }
}