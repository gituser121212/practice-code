public class sorting{
    public static void main(String args[]){
        int arr[]={4,1,7,2,9,6,8,10};
        int n=arr.length;
        System.out.print("UNSORTED ARRAY--->");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //bubble(arr,n);
        //selection(arr,n);
        //insertion(arr,n);
        counting(arr,n);   
        print(arr,n);   
    }

    public static void print(int arr[],int n){
        System.out.print("SORTED ARRAY--->");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubble(int arr[],int n){
        boolean swap=false;
        for(int turn=0; turn<n-1; turn++){
            for(int j=0; j<n-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public static void selection(int arr[],int n){
        for(int i=0; i<n-1; i++){
            int smallest=i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swapping
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
    }

    public static void insertion(int arr[],int n){
        for(int i=1; i<n; i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void counting(int arr[],int n){
        //finding largest element
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        //making count array
        int count[]=new int[largest+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
    }
}