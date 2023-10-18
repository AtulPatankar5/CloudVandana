var arr=[3,4,6,1,6,7,5,2];

for( var i=0;i<arr.length;i++){
    for( var j=i+1;j<arr.length;j++){
        if(arr[i]<=arr[j]){
            var temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
console.log(arr)
