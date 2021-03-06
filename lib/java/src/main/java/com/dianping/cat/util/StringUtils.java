package com.dianping.cat.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return str != null && str.length() > 0;
    }

    public static String join(Collection<String> list, String separator) {
        StringBuilder sb = new StringBuilder(1024);
        boolean first = true;

        for (String item : list) {
            if (first) {
                first = false;
            } else {
                sb.append(separator);
            }

            sb.append(item);
        }

        return sb.toString();
    }

    public static String join(double[] count, char spit) {
        boolean first = true;
        StringBuilder sb = new StringBuilder(128);

        for (double i : count) {
            if (first) {
                sb.append(i);
                first = false;
            } else {
                sb.append(spit).append(i);
            }
        }
        return sb.toString();
    }

    public static String join(int[] count, char spit) {
        boolean first = true;
        StringBuilder sb = new StringBuilder(128);

        for (int i : count) {
            if (first) {
                sb.append(i);
                first = false;
            } else {
                sb.append(spit).append(i);
            }
        }
        return sb.toString();
    }

    public static String join(long[] count, char spit) {
        boolean first = true;
        StringBuilder sb = new StringBuilder(128);

        for (long i : count) {
            if (first) {
                sb.append(i);
                first = false;
            } else {
                sb.append(spit).append(i);
            }
        }
        return sb.toString();
    }

    public static String normalizeSpace(String str) {
        int len = str.length();
        StringBuilder sb = new StringBuilder(len);
        boolean space = false;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            switch (ch) {
                case ' ':
                case '\t':
                case '\r':
                case '\n':
                    space = true;
                    break;
                default:
                    if (space) {
                        sb.append(' ');
                        space = false;
                    }

                    sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static List<String> split(String str, char c) {
        List<String> results = new ArrayList<String>();

        for (int i = 0; i < str.length(); ) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < str.length(); j++) {
                char tmp = str.charAt(j);

                if (j == str.length() - 1) {
                    sb.append(tmp);
                    results.add(sb.toString());

                    i = j + 1;
                    break;
                } else if (tmp == c) {
                    results.add(sb.toString());

                    i = j + 1;
                    break;
                } else {
                    sb.append(tmp);
                }
            }
        }

        return results;
    }

    public static String trimAll(String str) {
        if (str == null) {
            return null;
        }

        int len = str.length();
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            switch (ch) {
                case ' ':
                case '\t':
                case '\r':
                case '\n':
                    break;
                default:
                    sb.append(ch);
            }
        }

        return sb.toString();
    }
}
