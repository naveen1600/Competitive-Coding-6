// Time Complexity: O(1)
// Space Complexity: O(n)

class Logger {
    HashMap<String, Integer> map;

    public Logger() {
        this.map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message)) {
            map.put(message, timestamp + 10);
            return true;
        } else {
            if (timestamp >= map.get(message)) {
                map.put(message, timestamp + 10);
                return true;
            } else
                return false;
        }

    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */