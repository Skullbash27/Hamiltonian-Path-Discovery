
public class HamiltonianPath {
	
	private static int len;
	private static int[]path;
	private static int noOfPaths = 0; 
	
	public void hamiltonianPath(int[][] topology, int source){ 
		len = x.length;
		path = new int[len];
		int i = source-1;
		path[0]=source;
		findHamiltonianPath(topology,i,0);
	}

	private void findHamiltonianPath(int[][] graph,int y,int l){

        for(int i=0;i<len;i++){        

            if(graph[i][y]!=0){     

                if(findDuplicate(path,i+1)) { 
                    continue;
                }
                l++;            
                path[l]=i+1;    
                if(l==len-1){
                    noOfPaths++;   
                    if (noOfPaths == 1) {
                    	System.out.println("Hamiltonian path of graph: ");
                    }
                    printPath(path);
                    l--;
                    continue;
                }

                graph[i][y]=0;
				graph[y][i]=0;  
                findHamiltonianPath(M,i,l); 
                l--;                      
                graph[i][y]=1; 
				graph[y][i]=1;
            }
		}
		path[l+1]=0;    
	}                             

	public void printPath(int[] x){

		System.out.print(noOfPaths+" : ");
		for(int i:x){
			System.out.print(i+" ");
		}
			System.out.println();   
	}

	private boolean findDuplicate(int[] x,int target){ 
		boolean t=false;                        
		for(int i:x){
			if(i==target){
				t = true;
				break;
			}
		}
		return t;
	} 
}