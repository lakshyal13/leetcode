
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        // Step 1: Calculate the length
        int n = 0;
        ListNode curr = head;

        while (curr != null) {
            n++;
            curr = curr.next;
        }

        // Step 2: Calculate base size and extra nodes
        int base = n / k;
        int extra = n % k;

        ListNode[] result = new ListNode[k];

        curr = head;

        // Step 3: Split into k parts
        for (int i = 0; i < k; i++) {

            result[i] = curr;

            // Determine size of current part
            int size = base + (extra > 0 ? 1 : 0);

            if (extra > 0) {
                extra--;
            }

            // Traverse the current part
            for (int j = 0; j < size - 1; j++) {
                if (curr != null) {
                    curr = curr.next;
                }
            }

            // Disconnect current part
            if (curr != null) {
                ListNode nextPart = curr.next;
                curr.next = null;
                curr = nextPart;
            }
        }

        return result;
    }
}
