class Solution {
private void solve(int index, int target, int[] candidates, List<List<Integer>> ans, List<Integer> db) {
        if (target == 0) {
            ans.add(new ArrayList<>(db));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            if (i > index && candidates[i] == candidates[i - 1]) { // AVOID DUPLICATES
                continue;
            }
            db.add(candidates[i]);
            solve(i + 1, target - candidates[i], candidates, ans, db);
            db.remove(db.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }
}
