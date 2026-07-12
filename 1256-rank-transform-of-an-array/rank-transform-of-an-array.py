class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        y=list(arr)
        arr.sort()
        mapping={} 
        i=1
        for num in arr:
            if num not in mapping:
                mapping[num]=i
                i=i+1

        ans=[]     
        for num in y:
             ans.append(mapping[num])

        return ans                
             