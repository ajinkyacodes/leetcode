package M07_July2025;
/*
Link: https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description/
1233. Remove Sub-Folders from the Filesystem
 */
import java.util.*;
public class L250719_Medium1233_Remove_SubFolders_from_the_Filesystem {
    // Approach: Sorting
    public List<String> removeSubfolders(String[] folder) {
        // Sort the folders alphabetically
        Arrays.sort(folder);

        // Initialize the result list and add the first folder
        List<String> result = new ArrayList<>();
        result.add(folder[0]);

        // Iterate through each folder and check if it's a sub-folder of the last added folder in the result
        for (int i = 1; i < folder.length; i++) {
            String lastFolder = result.get(result.size() - 1);
            lastFolder += '/';

            // Check if the current folder starts with the last added folder path
            if (!folder[i].startsWith(lastFolder)) {
                result.add(folder[i]);
            }
        }

        // Return the result containing only non-sub-folders
        return result;
    }
    // time = O(N⋅LlogN)
    // space = O(N⋅L)
}
