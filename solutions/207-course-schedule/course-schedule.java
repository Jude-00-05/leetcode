class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int from=edge[0];
            int to=edge[1];
            graph.get(from).add(to);
            indegree[to]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
                queue.add(i);
        }
        int index=0;
        int[] answer=new int[n];
        while(!queue.isEmpty()){
            int node=queue.poll();
            answer[index++]=node;
            for(int neighbour:graph.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    queue.add(neighbour);
                }
            }
        }
        if(index!=n){
            return false;
        }
        return true;
    }
}