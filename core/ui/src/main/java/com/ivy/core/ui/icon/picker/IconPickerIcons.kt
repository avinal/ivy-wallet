package com.ivy.core.ui.icon.picker

import com.ivy.core.ui.icon.picker.PickerItemUnverified.Icon
import com.ivy.core.ui.icon.picker.PickerItemUnverified.SectionDivider

// region Icons
fun pickerItems(): List<PickerItemUnverified> = listOf(
    ivyIcons(),
    vueBrands(),
    vueBuilding(),
    vueChart(),
    vueCrypto(),
    vueDelivery(),
    vueDesign(),
    vueDev(),
    vueEducation(),
    vueFilesLocation(),
    vueMain(),
    vueMedia(),
    vueMessages(),
    vueMoney(),
    vuePC(),
    vuePeople(),
    vueSecurity(),
    vueShop(),
    vueSupport(),
    vueTransport(),
    vueType(),
    vueWeather()
).flatten()
// endregion

// region Ivy Icons
private fun ivyIcons(): List<PickerItemUnverified> = listOf(
    SectionDivider("Ivy"),
    Icon("account"),
    Icon("category"),
    Icon("cash"),
    Icon("bank"),
    Icon("revolut"),
    Icon("clothes2"),
    Icon("clothes"),
    Icon("family"),
    Icon("star"),
    Icon("education"),
    Icon("fitness"),
    Icon("loan"),
    Icon("orderfood"),
    Icon("orderfood2"),
    Icon("pet"),
    Icon("restaurant"),
    Icon("selfdevelopment"),
    Icon("work"),
    Icon("vehicle"),
    Icon("atom"),
    Icon("bills"),
    Icon("birthday"),
    Icon("calculator"),
    Icon("camera"),
    Icon("chemistry"),
    Icon("coffee"),
    Icon("connect"),
    Icon("dna"),
    Icon("doctor"),
    Icon("document"),
    Icon("drink"),
    Icon("farmacy"),
    Icon("fingerprint"),
    Icon("fishfood"),
    Icon("food2"),
    Icon("fooddrink"),
    Icon("furniture"),
    Icon("gambling"),
    Icon("game"),
    Icon("gears"),
    Icon("gift"),
    Icon("groceries"),
    Icon("hairdresser"),
    Icon("health"),
    Icon("hike"),
    Icon("house"),
    Icon("insurance"),
    Icon("label"),
    Icon("leaf"),
    Icon("location"),
    Icon("makeup"),
    Icon("music"),
    Icon("notice"),
    Icon("people"),
    Icon("plant"),
    Icon("programming"),
    Icon("relationship"),
    Icon("rocket"),
    Icon("safe"),
    Icon("sail"),
    Icon("server"),
    Icon("shopping2"),
    Icon("shopping"),
    Icon("sports"),
    Icon("stats"),
    Icon("tools"),
    Icon("transport"),
    Icon("travel"),
    Icon("trees"),
    Icon("zeus"),
    Icon("calendar"),
    Icon("crown"),
    Icon("diamond"),
    Icon("palette"),
)
// endregion

// region Brands (Vue)
private fun vueBrands(): List<PickerItemUnverified> = listOf(
    SectionDivider("Brands"),
    Icon("ic_vue_brands_triangle"),
    Icon("ic_vue_brands_trello"),
    Icon("ic_vue_brands_html5"),
    Icon("ic_vue_brands_spotify"),
    Icon("ic_vue_brands_bootsrap"),
    Icon("ic_vue_brands_dribbble"),
    Icon("ic_vue_brands_google_play"),
    Icon("ic_vue_brands_dropbox"),
    Icon("ic_vue_brands_js"),
    Icon("ic_vue_brands_drive"),
    Icon("ic_vue_brands_paypal"),
    Icon("ic_vue_brands_be"),
    Icon("ic_vue_brands_figma"),
    Icon("ic_vue_brands_messenger"),
    Icon("ic_vue_brands_facebook"),
    Icon("ic_vue_brands_framer"),
    Icon("ic_vue_brands_whatsapp"),
    Icon("ic_vue_brands_html3"),
    Icon("ic_vue_brands_zoom"),
    Icon("ic_vue_brands_ok"),
    Icon("ic_vue_brands_twitch"),
    Icon("ic_vue_brands_youtube"),
    Icon("ic_vue_brands_apple"),
    Icon("ic_vue_brands_android"),
    Icon("ic_vue_brands_slack"),
    Icon("ic_vue_brands_vuesax"),
    Icon("ic_vue_brands_blogger"),
    Icon("ic_vue_brands_photoshop"),
    Icon("ic_vue_brands_python"),
    Icon("ic_vue_brands_google"),
    Icon("ic_vue_brands_xd"),
    Icon("ic_vue_brands_illustrator"),
    Icon("ic_vue_brands_xiaomi"),
    Icon("ic_vue_brands_windows"),
    Icon("ic_vue_brands_snapchat"),
    Icon("ic_vue_brands_ui8"),
)
// endregion

// region Building (Vue)
private fun vueBuilding(): List<PickerItemUnverified> = listOf(
    SectionDivider("Building"),
    Icon("ic_vue_building_building1"),
    Icon("ic_vue_building_buildings"),
    Icon("ic_vue_building_hospital"),
    Icon("ic_vue_building_building"),
    Icon("ic_vue_building_bank"),
    Icon("ic_vue_building_house"),
    Icon("ic_vue_building_courthouse"),
)
// endregion

// region Chart (Vue)
private fun vueChart(): List<PickerItemUnverified> = listOf(
    SectionDivider("Chart"),
    Icon("ic_vue_chart_diagram"),
    Icon("ic_vue_chart_graph"),
    Icon("ic_vue_chart_status_up"),
    Icon("ic_vue_chart_chart"),
    Icon("ic_vue_chart_trend_up"),
)
// endregion

// region Crypto (Vue)
private fun vueCrypto(): List<PickerItemUnverified> = listOf(
    SectionDivider("Crypto"),
    Icon("ic_vue_crypto_dent"),
    Icon("ic_vue_crypto_icon"),
    Icon("ic_vue_crypto_decred"),
    Icon("ic_vue_crypto_ocean_protocol"),
    Icon("ic_vue_crypto_hedera_hashgraph"),
    Icon("ic_vue_crypto_binance_usd"),
    Icon("ic_vue_crypto_maker"),
    Icon("ic_vue_crypto_xrp"),
    Icon("ic_vue_crypto_harmony"),
    Icon("ic_vue_crypto_theta"),
    Icon("ic_vue_crypto_celsius_"),
    Icon("ic_vue_crypto_vibe"),
    Icon("ic_vue_crypto_augur"),
    Icon("ic_vue_crypto_graph"),
    Icon("ic_vue_crypto_monero"),
    Icon("ic_vue_crypto_aave"),
    Icon("ic_vue_crypto_dai"),
    Icon("ic_vue_crypto_litecoin"),
    Icon("ic_vue_crypto_tether"),
    Icon("ic_vue_crypto_thorchain"),
    Icon("ic_vue_crypto_nexo"),
    Icon("ic_vue_crypto_chainlink"),
    Icon("ic_vue_crypto_ethereum_classic"),
    Icon("ic_vue_crypto_usd_coin"),
    Icon("ic_vue_crypto_nem"),
    Icon("ic_vue_crypto_eos"),
    Icon("ic_vue_crypto_emercoin"),
    Icon("ic_vue_crypto_dash"),
    Icon("ic_vue_crypto_ontology"),
    Icon("ic_vue_crypto_ftx_token"),
    Icon("ic_vue_crypto_educare"),
    Icon("ic_vue_crypto_solana"),
    Icon("ic_vue_crypto_ethereum"),
    Icon("ic_vue_crypto_velas"),
    Icon("ic_vue_crypto_hex"),
    Icon("ic_vue_crypto_polkadot"),
    Icon("ic_vue_crypto_huobi_token"),
    Icon("ic_vue_crypto_polyswarm"),
    Icon("ic_vue_crypto_ankr"),
    Icon("ic_vue_crypto_enjin_coin"),
    Icon("ic_vue_crypto_polygon"),
    Icon("ic_vue_crypto_wing"),
    Icon("ic_vue_crypto_nebulas"),
    Icon("ic_vue_crypto_iost"),
    Icon("ic_vue_crypto_binance_coin"),
    Icon("ic_vue_crypto_kyber_network"),
    Icon("ic_vue_crypto_trontron"),
    Icon("ic_vue_crypto_stellar"),
    Icon("ic_vue_crypto_avalanche"),
    Icon("ic_vue_crypto_wanchain"),
    Icon("ic_vue_crypto_cardano"),
    Icon("ic_vue_crypto_okb"),
    Icon("ic_vue_crypto_stacks"),
    Icon("ic_vue_crypto_siacoin"),
    Icon("ic_vue_crypto_autonio"),
    Icon("ic_vue_crypto_civic"),
    Icon("ic_vue_crypto_zel"),
    Icon("ic_vue_crypto_quant"),
    Icon("ic_vue_crypto_tenx"),
    Icon("ic_vue_crypto_celo"),
    Icon("ic_vue_crypto_bitcoin"),
)
// endregion

// region Delivery (Vue)
private fun vueDelivery(): List<PickerItemUnverified> = listOf(
    SectionDivider("Delivery"),
    Icon("ic_vue_delivery_package"),
    Icon("ic_vue_delivery_receive"),
    Icon("ic_vue_delivery_box1"),
    Icon("ic_vue_delivery_box"),
    Icon("ic_vue_delivery_truck"),
)
// endregion

// region Design (Vue)
private fun vueDesign(): List<PickerItemUnverified> = listOf(
    SectionDivider("Design"),
    Icon("ic_vue_design_bezier"),
    Icon("ic_vue_design_brush"),
    Icon("ic_vue_design_color_swatch"),
    Icon("ic_vue_design_scissors"),
    Icon("ic_vue_design_magicpen"),
    Icon("ic_vue_design_roller"),
    Icon("ic_vue_design_tool_pen"),
)
// endregion

// region Dev (Vue)
private fun vueDev(): List<PickerItemUnverified> = listOf(
    SectionDivider("Dev"),
    Icon("ic_vue_dev_code"),
    Icon("ic_vue_dev_hierarchy"),
    Icon("ic_vue_dev_relation"),
    Icon("ic_vue_dev_arrow"),
    Icon("ic_vue_dev_data"),
    Icon("ic_vue_dev_hashtag"),
)
// endregion

// region Education (Vue)
private fun vueEducation(): List<PickerItemUnverified> = listOf(
    SectionDivider("Education"),
    Icon("ic_vue_edu_planer"),
    Icon("ic_vue_edu_briefcase"),
    Icon("ic_vue_edu_award"),
    Icon("ic_vue_edu_glass"),
    Icon("ic_vue_edu_graduate_cap"),
    Icon("ic_vue_edu_calculator"),
    Icon("ic_vue_edu_note"),
    Icon("ic_vue_edu_magazine"),
    Icon("ic_vue_edu_pen"),
    Icon("ic_vue_edu_telescope"),
    Icon("ic_vue_edu_book"),
    Icon("ic_vue_edu_ruler_pen"),
    Icon("ic_vue_edu_todo"),
    Icon("ic_vue_edu_omega"),
    Icon("ic_vue_edu_bookmark"),
)
// endregion

// region Files & Location (Vue)
private fun vueFilesLocation(): List<PickerItemUnverified> = listOf(
    SectionDivider("Files"),
    Icon("ic_vue_files_folder_favorite"),
    Icon("ic_vue_files_folder"),
    Icon("ic_vue_files_folder_cloud"),
    SectionDivider("Location"),
    Icon("ic_vue_location_map1"),
    Icon("ic_vue_location_map"),
    Icon("ic_vue_location_location"),
    Icon("ic_vue_location_global"),
    Icon("ic_vue_location_global_search"),
    Icon("ic_vue_location_routing"),
    Icon("ic_vue_location_discover"),
    Icon("ic_vue_location_radar"),
    Icon("ic_vue_location_global_edit"),
)
// endregion

// region Main (Vue)
private fun vueMain(): List<PickerItemUnverified> = listOf(
    SectionDivider("Main"),
    Icon("ic_vue_main_cake"),
    Icon("ic_vue_main_reserve"),
    Icon("ic_vue_main_archive"),
    Icon("ic_vue_main_signpost"),
    Icon("ic_vue_main_coffee"),
    Icon("ic_vue_main_sport"),
    Icon("ic_vue_main_notification"),
    Icon("ic_vue_main_lamp_charge"),
    Icon("ic_vue_main_home"),
    Icon("ic_vue_main_judge"),
    Icon("ic_vue_main_timer"),
    Icon("ic_vue_main_lamp"),
    Icon("ic_vue_main_battery_charging"),
    Icon("ic_vue_main_calendar"),
    Icon("ic_vue_main_home_wifi"),
    Icon("ic_vue_main_tree"),
    Icon("ic_vue_main_battery_half"),
    Icon("ic_vue_main_send"),
    Icon("ic_vue_main_glass"),
    Icon("ic_vue_main_emoji_normal"),
    Icon("ic_vue_main_share"),
    Icon("ic_vue_main_trash"),
    Icon("ic_vue_main_milk"),
    Icon("ic_vue_main_lifebuoy"),
    Icon("ic_vue_main_broom"),
    Icon("ic_vue_main_gift"),
    Icon("ic_vue_main_clock"),
    Icon("ic_vue_main_emoji_happy"),
    Icon("ic_vue_main_home_safe"),
    Icon("ic_vue_main_crown"),
    Icon("ic_vue_main_cup"),
    Icon("ic_vue_main_emoji_sad"),
    Icon("ic_vue_main_pet"),
    Icon("ic_vue_main_flash"),
)
// endregion

// region Media (Vue)
private fun vueMedia(): List<PickerItemUnverified> = listOf(
    SectionDivider("Media"),
    Icon("ic_vue_media_microphone"),
    Icon("ic_vue_media_music"),
    Icon("ic_vue_media_voice"),
    Icon("ic_vue_media_image"),
    Icon("ic_vue_media_scissors"),
    Icon("ic_vue_media_mountains"),
    Icon("ic_vue_media_film"),
    Icon("ic_vue_media_photocamera"),
    Icon("ic_vue_media_film_play"),
    Icon("ic_vue_media_camera"),
    Icon("ic_vue_media_screenmirroring"),
    Icon("ic_vue_media_speaker"),
    Icon("ic_vue_media_play"),
    Icon("ic_vue_media_subtitle"),
    Icon("ic_vue_media_setting"),
)
// endregion

// region Messages (Vue)
private fun vueMessages(): List<PickerItemUnverified> = listOf(
    SectionDivider("Messages"),
    Icon("ic_vue_messages_msg_favorite"),
    Icon("ic_vue_messages_direct"),
    Icon("ic_vue_messages_msg_notification"),
    Icon("ic_vue_messages_device_msg"),
    Icon("ic_vue_messages_edit"),
    Icon("ic_vue_messages_msgs"),
    Icon("ic_vue_messages_msg_text"),
    Icon("ic_vue_messages_letter"),
    Icon("ic_vue_messages_msg"),
    Icon("ic_vue_messages_msg_search"),
)
// endregion

// region Money (Vue)
private fun vueMoney(): List<PickerItemUnverified> = listOf(
    SectionDivider("Money"),
    Icon("ic_vue_money_bitcoin_refresh"),
    Icon("ic_vue_money_dollar"),
    Icon("ic_vue_money_archive"),
    Icon("ic_vue_money_coins"),
    Icon("ic_vue_money_discount"),
    Icon("ic_vue_money_recive"),
    Icon("ic_vue_money_card_send"),
    Icon("ic_vue_money_buy_crypto"),
    Icon("ic_vue_money_card_bitcoin"),
    Icon("ic_vue_money_buy_bitcoin"),
    Icon("ic_vue_money_ticket_star"),
    Icon("ic_vue_money_wallet"),
    Icon("ic_vue_money_send"),
    Icon("ic_vue_money_ticket_discount"),
    Icon("ic_vue_money_wallet_cards"),
    Icon("ic_vue_money_receipt_empty"),
    Icon("ic_vue_money_percentage"),
    Icon("ic_vue_money_math"),
    Icon("ic_vue_money_security_card"),
    Icon("ic_vue_money_wallet_money"),
    Icon("ic_vue_money_ticket"),
    Icon("ic_vue_money_card_receive"),
    Icon("ic_vue_money_wallet_empty"),
    Icon("ic_vue_money_transfer"),
    Icon("ic_vue_money_card_coin"),
    Icon("ic_vue_money_receipt_items"),
    Icon("ic_vue_money_tag"),
    Icon("ic_vue_money_receipt_discount"),
    Icon("ic_vue_money_card"),
)
// endregion

// region PC (Vue)
private fun vuePC(): List<PickerItemUnverified> = listOf(
    SectionDivider("PC"),
    Icon("ic_vue_pc_charging"),
    Icon("ic_vue_pc_watch"),
    Icon("ic_vue_pc_headphone"),
    Icon("ic_vue_pc_gameboy"),
    Icon("ic_vue_pc_phone_call"),
    Icon("ic_vue_pc_setting"),
    Icon("ic_vue_pc_monitor"),
    Icon("ic_vue_pc_cpu"),
    Icon("ic_vue_pc_printer"),
    Icon("ic_vue_pc_bluetooth"),
    Icon("ic_vue_pc_wifi"),
    Icon("ic_vue_pc_game"),
    Icon("ic_vue_pc_speaker"),
    Icon("ic_vue_pc_phone"),
)
// endregion

// region People (Vue)
private fun vuePeople(): List<PickerItemUnverified> = listOf(
    SectionDivider("People"),
    Icon("ic_vue_people_2persons"),
    Icon("ic_vue_people_person_tag"),
    Icon("ic_vue_people_person_search"),
    Icon("ic_vue_people_people"),
    Icon("ic_vue_people_person"),
)
// endregion

// region Security (Vue)
private fun vueSecurity(): List<PickerItemUnverified> = listOf(
    SectionDivider("Security"),
    Icon("ic_vue_security_eye"),
    Icon("ic_vue_security_shield_security"),
    Icon("ic_vue_security_key"),
    Icon("ic_vue_security_alarm"),
    Icon("ic_vue_security_lock"),
    Icon("ic_vue_security_password"),
    Icon("ic_vue_security_radar"),
    Icon("ic_vue_security_shield_person"),
    Icon("ic_vue_security_shield"),
)
// endregion

// region Shop (Vue)
private fun vueShop(): List<PickerItemUnverified> = listOf(
    SectionDivider("Shop"),
    Icon("ic_vue_shop_cart"),
    Icon("ic_vue_shop_bag"),
    Icon("ic_vue_shop_barcode"),
    Icon("ic_vue_shop_bag1"),
    Icon("ic_vue_shop_shop"),
)
// endregion

// region Support (Vue)
private fun vueSupport(): List<PickerItemUnverified> = listOf(
    SectionDivider("Support"),
    Icon("ic_vue_support_star"),
    Icon("ic_vue_support_medal"),
    Icon("ic_vue_support_dislike"),
    Icon("ic_vue_support_like_dislike"),
    Icon("ic_vue_support_smileys"),
    Icon("ic_vue_support_heart"),
    Icon("ic_vue_support_like"),
)
// endregion

// region Transport (Vue)
private fun vueTransport(): List<PickerItemUnverified> = listOf(
    SectionDivider("Transport"),
    Icon("ic_vue_transport_bus"),
    Icon("ic_vue_transport_airplane"),
    Icon("ic_vue_transport_train"),
    Icon("ic_vue_transport_ship"),
    Icon("ic_vue_transport_gas"),
    Icon("ic_vue_transport_car"),
    Icon("ic_vue_transport_car_wash"),
)
// endregion

// region Type (Vue)
private fun vueType(): List<PickerItemUnverified> = listOf(
    SectionDivider("Type"),
    Icon("ic_vue_type_link2"),
    Icon("ic_vue_type_text"),
    Icon("ic_vue_type_paperclip"),
    Icon("ic_vue_type_textalign_left"),
    Icon("ic_vue_type_translate"),
    Icon("ic_vue_type_textalign_right"),
    Icon("ic_vue_type_link"),
    Icon("ic_vue_type_textalign_center"),
    Icon("ic_vue_type_textalign_justifycenter"),
)
// endregion

// region Weather (Vue)
private fun vueWeather(): List<PickerItemUnverified> = listOf(
    SectionDivider("Weather"),
    Icon("ic_vue_weather_wind"),
    Icon("ic_vue_weather_cloud"),
    Icon("ic_vue_weather_flash"),
    Icon("ic_vue_weather_moon"),
    Icon("ic_vue_weather_drop"),
    Icon("ic_vue_weather_cold"),
    Icon("ic_vue_weather_sun"),
)
// endregion