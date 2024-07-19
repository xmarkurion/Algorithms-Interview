// https://leetcode.com/problems/valid-parentheses/description/

export function isValid(s: string): boolean {

    while( s.includes("{}") || s.includes("[]") || s.includes("()")){
        s = s.replace("{}", "");
        s = s.replace("[]", "");
        s = s.replace("()", "");
    }
    return (s.length == 0) ? true : false;
};

function switcheru(str:string):string{
    if ( str == "}") return "{";
    if ( str == "]") return "["
}