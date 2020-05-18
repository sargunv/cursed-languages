package me.sargunvohra.mcmods.language.xtend

import net.fabricmc.loader.api.LanguageAdapter
import net.fabricmc.loader.api.LanguageAdapterException
import net.fabricmc.loader.api.ModContainer
import net.fabricmc.loader.util.DefaultLanguageAdapter

class XtendAdapter implements LanguageAdapter {
    override <T> T create(ModContainer mod, String value, Class<T> type) {
        DefaultLanguageAdapter.INSTANCE.create(mod, value, type)
    }
}
