/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;
class LangItem{
    public String key;
    public String Value;
    LangItem(String key, String Value){
        this.key = key;
        this.Value = Value;
    }
}
/**
 *
 * @author admin
 */
public class VoteLang {
    /**
     * Array LangItem
     */
    private LangItem[] _langs;
    /**
     * Import languages
     * 
     * @param _langs 
     */
    public void _importLang(LangItem[] _langs)
    {
        this._langs = new LangItem[_langs.length];
        for(int i = 0; i < _langs.length; i++){
            this._langs[i] = _langs[i];
        }
    }
    /**
     * Return lang String
     * 
     * @param key
     * @return 
     */
    public String __t(String key)
    {
        int found = 0;
        boolean hasLang = false;
        for(int i = 0; i < this._langs.length; i++){
            if (this._langs[i].key == key){
                found = i;
                hasLang = true;
                break;
            }
        }
        if (hasLang){
            return this._langs[found].Value;
        }
        return key;
    }
    /**
     * TODO yourself
     * 
     * @param key
     * @param _args
     * @return 
     */
    public String __p(String key, String[] _args)
    {
        //TODO: print_r from _args
        return key;
    }
}
